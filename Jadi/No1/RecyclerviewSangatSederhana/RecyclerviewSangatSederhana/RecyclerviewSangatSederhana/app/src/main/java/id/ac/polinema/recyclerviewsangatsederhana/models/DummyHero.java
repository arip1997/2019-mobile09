package id.ac.polinema.recyclerviewsangatsederhana.models;

public class DummyHero {
    public String dummyName;
    public String photoName;

    public DummyHero(String dummyName, String photoName) {
        this.dummyName = dummyName;
        this.photoName = photoName;
    }

    public String getDummyName() {
        return dummyName;
    }

    public void setDummyName(String dummyName) {
        this.dummyName = dummyName;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
}
