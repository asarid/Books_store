package model.backend;

/**
 * Created by aviad on 17/11/2015.
 */
public final class BackendFactory {

   // private BackendFactory(){}
   // private static BackendFactory factory = null;

    static IBackend instance = null;

    public static String mode = "lists";

    public final static IBackend getInstance()
    {
        if (mode == "xml")
        {
            if (instance == null)
                instance = new model.datasource.DatabaseXML();
            return instance;
        }
        if (mode == "lists")
        {
            if (instance == null)
                instance = new model.datasource.DatabaseLists();
            return instance;
        }
        else
            return null;
    }
}
