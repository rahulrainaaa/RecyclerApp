package recyclerapp.app.recyclerapp;


public class Person
{
    public String name = "";
    public String desc = "";
    public int photoId = 0;

    public Person(String name, String desc, int photoId)
    {
        this.name = name;
        this.desc = desc;
        this.photoId = photoId;
    }

    public void set(String name, String desc, int photoId)
    {
        this.name = name;
        this.desc = desc;
        this.photoId = photoId;
    }

    public Person get()
    {
        return new Person(name, desc, photoId);
    }

    public String getName()
    {
        return name;
    }

    public String getDesc()
    {
        return desc;
    }

    public int getPhotoId()
    {
        return photoId;
    }
}