import java.util.*;
class playList {
    
    public static void main(String[] args) {
        HashMap<String,ArrayDeque<String>> hm = new HashMap<>();
        
        boolean flag = true;
       
        while(flag){
          System.out.println("Welcome to ABC Music!!\nChoose for : \n1)Onboard User\n2)Add Songs for a user\n3)Display latest songs of all users\n4)Exit");
          Scanner sc = new Scanner(System.in);
          int ch = sc.nextInt();
          switch(ch){
            case 1:
              onboardCustomer(hm);
              System.out.println("User Onboarded");
              break;
            
            case 2:
              addSongForUser(hm);
              System.out.println("Song added for provided user");
              break;

              default:
              System.out.println("Exiting!!!!!!!");
              flag = false;
            }  
         }
    }

    public static void onboardCustomer(HashMap<String,ArrayDeque<String>> hm){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the User : ");
        String name = sc.nextLine();
        System.out.print("Enter the size of the playlist : ");
        int size = sc.nextInt();
        
        ArrayDeque<String> q = new ArrayDeque<>(size);
        hm.put(name, q);
      }

      public static void addSongForUser(HashMap<String,ArrayDeque<String>> hm){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of the User : ");
        String name = sc.nextLine();
        System.out.print("Enter Name of the Song : ");
        String songName = sc.nextLine();
        ArrayDeque<String> songs = hm.get(name);
        if(songs==null){
          System.out.println("User "+name+" do not exist! Please onboard the user first!!");
        }else{
        songs.push(songName);
        }
      }
}