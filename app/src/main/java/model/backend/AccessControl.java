package model.backend;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.ArrayList;

/**
 * Created by aviad on 21/11/2015.
 */


public class AccessControl {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface AccessPermission {
        String permission() default "all";
    }

    private ArrayList<String> listForClients;
    private ArrayList<String> listForProviders;
    private ArrayList<String> listForStoreOwner;
    private Method [] methods;
    public AccessControl()
    {
        listForClients = new ArrayList<>();
        listForProviders = new ArrayList<>();
        listForStoreOwner = new ArrayList<>();

        methods = IBackend.class.getMethods();
        for (Method method : methods)
        {
            if (method.isAnnotationPresent(AccessPermission.class))
            {
                AccessPermission accessP = method.getAnnotation(AccessPermission.class);
                String perm = accessP.permission();
                if (perm.contains("client") || perm.equals("all"))
                    listForClients.add(method.getName());
                if (perm.contains("provider") || perm.equals("all"))
                    listForProviders.add(method.getName());
                listForStoreOwner.add(method.getName());
            }
        }
    }

    /**
     * check if a user have an access permission to the function
     * @param user the type of user - vlient, provider or storeOwner
     * @param func the name of the function to check
     * @return an boolean value which notating if the user has a permission to access this function
     */
    public boolean checkPermission(String user, String func) throws Exception
    {
        boolean contained = false;
        for (Method m : methods)
        {
            if (m.getName().equals(func))
                contained = true;
        }
        if (!contained)
            throw new Exception("There is no function like '" + func + "' or the access permission is not defined.");

        if (user.equals("client"))
            return listForClients.contains(func);
        if (user.equals("provider"))
            return listForProviders.contains(func);
        if (user.equals("storeOwner"))
            return listForStoreOwner.contains(func);
        else
            throw new Exception("there is no user tyoe like '" + user +"'!");
    }




    /*public static void invokeThis(Object theObject){

            Method [] methods = Class.forName(theObject.getClass().getName()).getMethods();

            for (int i = 0; i < methods.length; i++) {
                PermissionAccess accessor = methods[i].getAnnotation(AccessPermission.class);
                if(accessor != null){
                    int numberOfTimesToInvoke = accessor.numberOfTimesToInvoke();
                    for (int j = 0; j < numberOfTimesToInvoke; j++) {
                        methods[i].invoke(theObject, null);
                    }
                }
            }
    }*/


    /*
    AccessControl access = new AccessControl();
            System.out.println(access.checkPermission("provider", "addBook"));

     */



}
