import dev.bingulhan.hanstorage.HanData;
import dev.bingulhan.hanstorage.HanStorage;

public class Test {


    public static void main(String[] args) {

        //Automatic file is created
        HanStorage storage = new HanStorage("C:\\Users\\BingulHan\\Desktop\\HanStorage\\src\\main\\resources", "example");

        //How to add data
        HanData data = new HanData(1);
        data.setKey("github");
        data.setValue("bingulhan");
        storage.addData(data);

        //How to call data
        if (storage.getData("github").isPresent()) {
            HanData d = storage.getData("github").get();
            System.out.println("Key: "+d.getKey());
            System.out.println("Value: "+d.getValue());
            System.out.println("Line: "+d.getLine());

            d.setValue("test");
        }

        //How to save file
        storage.save();

        //List data
        storage.list();


        //How to delete data
    //    storage.remove("github");
        storage.save();

        /*Auto saves after deletion
        storage.removeSave("github");*/



    }

}
