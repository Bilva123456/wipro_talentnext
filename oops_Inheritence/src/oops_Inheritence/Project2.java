package oops_Inheritence;
import java.util.ArrayList;
import java.util.Scanner;

class Video {
    private String videoName;
    private boolean checkout;
    private int rating;
    
    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }
    
    public String getName() {
        return videoName;
    }
    
    public void doCheckout() {
        checkout = true;
    }
    
    public void doReturn() {
        checkout = false;
    }
    
    public void receiveRating(int rating) {
        this.rating = rating;
    }
    
    public int getRating() {
        return rating;
    }
    
    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private ArrayList<Video> store;
    
    public VideoStore() {
        store = new ArrayList<>();
    }
    
    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }
    
    public void doCheckout(String name) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }
    
    public void doReturn(String name) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }
    
    public void receiveRating(String name, int rating) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }
    
    public void listInventory() {
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s | %-15s | %-10s%n", "Video Name", "Checkout Status", "Rating");
        for (Video video : store) {
            System.out.printf("%-20s | %-15s | %-10d%n", 
                video.getName(), 
                video.getCheckout() ? "true" : "false", 
                video.getRating());
        }
        System.out.println("--------------------------------------------------");
    }
}

public class Project2 {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1.Add Videos:");
            System.out.println("2.Check Out Video :");
            System.out.println("3.Return Video :");
            System.out.println("4.Receive Rating :");
            System.out.println("5.List Inventory :");
            System.out.println("6.Exit :");
            System.out.print("Enter your choice (1..6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String videoName = scanner.nextLine();
                    videoStore.addVideo(videoName);
                    break;
                    
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String checkoutName = scanner.nextLine();
                    videoStore.doCheckout(checkoutName);
                    break;
                    
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String returnName = scanner.nextLine();
                    videoStore.doReturn(returnName);
                    break;
                    
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String rateName = scanner.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = scanner.nextInt();
                    videoStore.receiveRating(rateName, rating);
                    break;
                    
                case 5:
                    videoStore.listInventory();
                    break;
                    
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}