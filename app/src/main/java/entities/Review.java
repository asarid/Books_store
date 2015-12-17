package entities;

import java.util.Date;

//to update in android studio!

/**
 * Created by aviad on 12/11/2015.
 */
public class Review {

    private String reviewId;

    private String clientId;
    private String reviewContent;
    private float score; //out of 5
    private Date dateOfReview;

    /**
     * empty constructor which obtains default values for the attributes
     */
    public Review() {
        clientId = reviewContent = "";
        score = -1;
        dateOfReview = null;
    }

    /**
     * constructor of the class Review
     * @param reviewId the key of this review
     * @param clientId the key of the client who reported this review
     * @param reviewContent the content of the review
     * @param score point out of 5 of the qualiyt of service
     * @param dateOfReview the date in which the review was reported
     * @throws Exception if one of the arguments is invalid
     */
    public Review(String reviewId, String clientId, String reviewContent, float score, Date dateOfReview) throws Exception {
        if (reviewId == "")
            throw new Exception("review id is missing.");
        if (clientId == "")
            throw new Exception("client id is missing.");
        if (dateOfReview == null)
            throw new Exception("date of review is missing.");
        if (score > 5 || (score != -1 && score < 0))
            throw new Exception("score is invalid.");

        this.reviewId = reviewId;
        this.clientId = clientId;
        this.reviewContent = reviewContent;
        this.score = score;
        this.dateOfReview = dateOfReview;
    }

    /**
     * @return the id of the review
     */
    public String getReviewId() {
        return reviewId;
    }

    /**
     * set the key of this review
     * @param reviewId id of the review
     */
    public void setReviewId(String reviewId) throws Exception {
        if (reviewId == "")
            throw new Exception("review id is missing.");
        this.reviewId = reviewId;
    }

    /**
     * @return the key of the reporting client
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * set the key of this client who reported this review
     * @param clientId id of the client
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Date getDateOfReview() {
        return dateOfReview;
    }

    public void setDateOfReview(Date dateOfReview) {
        this.dateOfReview = dateOfReview;
    }
}
