package library.libraryitems;

public class Media extends LibraryItem {

    private String producer;
    private boolean matureAudiencesOnly;
    private boolean needComputerToUse;
    private String genre;
    private float duration;

    public Media(String name, int id, int checkoutDurationInDays, double checkoutFee, boolean stocked, String producer,
                 boolean matureAudiencesOnly, boolean needComputerToUse, String genre, float duration) {
        super(name, id, checkoutDurationInDays, checkoutFee, stocked);
        setMatureAudiencesOnly(matureAudiencesOnly);
        setProducer(producer);
        setNeedComputerToUse(needComputerToUse);
        setGenre(genre);
        setDuration(duration);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isMatureAudiencesOnly() {
        return matureAudiencesOnly;
    }

    public void setMatureAudiencesOnly(boolean matureAudiencesOnly) {
        this.matureAudiencesOnly = matureAudiencesOnly;
    }

    public boolean isNeedComputerToUse() {
        return needComputerToUse;
    }

    public void setNeedComputerToUse(boolean needComputerToUse) {
        this.needComputerToUse = needComputerToUse;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public String needComputer() {
        return needComputerToUse ? "A computer is needed to use this product." :
                "A computer is not needed to use this product";
    }

    public String thirteenYearsOrOlder() {
        return matureAudiencesOnly ? "Children under the age of 13 cannot check this item out without parent approval." :
                "This item can be checked out by this customer.";
    }

}