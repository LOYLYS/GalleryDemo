package edu.ptit.vhlee.mygallery;

public class Photo {
    private String mName;
    private String mPath;

    public Photo(String name, String path) {
        mName = name;
        mPath = path;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPath() {
        return mPath;
    }

    public void setPath(String path) {
        mPath = path;
    }
}
