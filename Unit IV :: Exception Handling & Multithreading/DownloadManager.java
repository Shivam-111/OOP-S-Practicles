// // 17.	Download Manager
// // Create a class DownloadManager. Create multiple threads using 
// // Runnable interface. Each thread represents file download.
// // Output: Downloading messages.


class FileDownload implements Runnable{
    private String fileName;
    public FileDownload(String fileName){
        this.fileName = fileName;
    }
    public void run(){
        System.out.println("Downloading: "+ fileName + " ...");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(fileName + " download interrupted.");

        }
        System.out.println("Finished downloading: " + fileName);

    }
}

public class DownloadManager {
    public static void main(String args[]){
        Thread t1 = new Thread(new FileDownload("File1.zip"));
        Thread t2 = new Thread(new FileDownload("File2.zip"));
        Thread t3 = new Thread(new FileDownload("File3.zip"));

        t1.start();
        t2.start();
        t3.start();


    }
}

