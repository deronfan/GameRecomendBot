import java.util.Scanner;
import java.util.Arrays;


public class Wordle {
   public static void main(String[] args) {


       System.out.println("Let's start a game of wordle, shall we?' I'll assume you know the rules.");
  
       //predefined word list and select a random word
       String[] words = {
        "About", "Alert", "Argue", "Beach",
        "Above", "Alike", "Arise", "Began",
        "Abuse", "Alive", "Array", "Begin",
        "Actor", "Allow", "Aside", "Begun",
        "Acute", "Alone", "Asset", "Being",
        "Admit", "Along", "Audio", "Below",
        "Adopt", "Alter", "Audit", "Bench",
        "Adult", "Among", "Avoid", "Billy",
        "After", "Anger", "Award", "Birth",
        "Again", "Angle", "Aware", "Black",
        "Agent", "Angry", "Badly", "Blame",
        "Agree", "Apart", "Baker", "Blind",
        "Ahead", "Apple", "Bases", "Block",
        "Alarm", "Apply", "Basic", "Blood",
        "Album", "Arena", "Basis", "Board",
        "Boost", "Buyer", "China", "Cover",
        "Booth", "Cable", "Chose", "Craft",
        "Bound", "Calif", "Civil", "Crash",
        "Brain", "Carry", "Claim", "Cream",
        "Brand", "Catch", "Class", "Crime",
        "Bread", "Cause", "Clean", "Cross",
        "Break", "Chain", "Clear", "Crowd",
        "Breed", "Chair", "Click", "Crown",
        "Brief", "Chart", "Clock", "Curve",
        "Bring", "Chase", "Close", "Cycle",
        "Broad", "Cheap", "Coach", "Daily",
        "Broke", "Check", "Coast", "Dance",
        "Brown", "Chest", "Could", "Dated",
        "Build", "Chief", "Count", "Dealt",
        "Built", "Child", "Court", "Death",
        "Debut", "Entry", "Forth", "Group",
        "Delay", "Equal", "Forty", "Grown",
        "Depth", "Error", "Forum", "Guard",
        "Doing", "Event", "Found", "Guess",
        "Doubt", "Every", "Frame", "Guest",
        "Dozen", "Exact", "Frank", "Guide",
        "Draft", "Exist", "Fraud", "Happy",
        "Drama", "Extra", "Fresh", "Harry",
        "Drawn", "Faith", "Front", "Heart",
        "Dream", "False", "Fruit", "Heavy",
        "Dress", "Fault", "Fully", "Hence",
        "Drill", "Fibre", "Funny", "Night",
        "Drink", "Field", "Giant", "Horse",
        "Drive", "Fifth", "Given", "Hotel",
        "Drove", "Fifty", "Glass", "House",
        "Dying", "Fight", "Globe", "Human",
        "Eager", "Final", "Going", "Ideal",
        "Early", "First", "Grace", "Image",
        "Earth", "Fixed", "Grade", "Index",
        "Eight", "Flash", "Grand", "Inner",
        "Elite", "Fleet", "Grant", "Input",
        "Empty", "Floor", "Grass", "Issue",
        "Enemy", "Fluid", "Great", "Irony",
        "Enjoy", "Focus", "Green", "Juice",
        "Enter", "Force", "Gross", "Joint",
        "Judge", "Metal", "Media", "Newly",
        "Known", "Local", "Might", "Noise",
        "Label", "Logic", "Minor", "North",
        "Large", "Loose", "Minus", "Noted",
        "Laser", "Lower", "Mixed", "Novel",
        "Later", "Lucky", "Model", "Nurse",
        "Laugh", "Lunch", "Money", "Occur",
        "Layer", "Lying", "Month", "Ocean",
        "Learn", "Magic", "Moral", "Offer",
        "Lease", "Major", "Motor", "Often",
        "Least", "Maker", "Mount", "Order",
        "Leave", "March", "Mouse", "Other",
        "Legal", "Music", "Mouth", "Ought",
        "Level", "Match", "Movie", "Paint",
        "Light", "Mayor", "Needs", "Paper",
        "Limit", "Meant", "Never", "Party",
        "Peace", "Power", "Radio", "Round",
        "Panel", "Press", "Raise", "Route",
        "Phase", "Price", "Range", "Royal",
        "Phone", "Pride", "Rapid", "Rural",
        "Photo", "Prime", "Ratio", "Scale",
        "Piece", "Print", "Reach", "Scene",
        "Pilot", "Prior", "Ready", "Scope",
        "Pitch", "Prize", "Refer", "Score",
        "Place", "Proof", "Right", "Sense",
        "Plain", "Proud", "Rival", "Serve",
        "Plane", "Prove", "River", "Seven",
        "Plant", "Queen", "Quick", "Shall",
        "Plate", "Sixth", "Stand", "Shape",
        "Point", "Quiet", "Roman", "Share",
        "Pound", "Quite", "Rough", "Sharp",
        "Sheet", "Spare", "Style", "Times",
        "Shelf", "Speak", "Sugar", "Tired",
        "Shell", "Speed", "Suite", "Title",
        "Shift", "Spend", "Super", "Today",
        "Shirt", "Spent", "Sweet", "Topic",
        "Shock", "Split", "Table", "Total",
        "Shoot", "Spoke", "Taken", "Touch",
        "Short", "Sport", "Taste", "Tough",
        "Shown", "Staff", "Taxes", "Tower",
        "Sight", "Stage", "Teach", "Track",
        "Since", "Stake", "Teeth", "Trade",
        "Sixty", "Start", "Texas", "Treat",
        "Sized", "State", "Thank", "Trend",
        "Skill", "Steam", "Theft", "Trial",
        "Sleep", "Steel", "Their", "Tried",
        "Slide", "Stick", "Theme", "Tries",
        "Small", "Still", "There", "Truck",
        "Smart", "Stock", "These", "Truly",
        "Smile", "Stone", "Thick", "Trust",
        "Smith", "Stood", "Thing", "Truth",
        "Smoke", "Store", "Think", "Twice",
        "Solid", "Storm", "Third", "Under",
        "Solve", "Story", "Those", "Undue",
        "Sorry", "Strip", "Three", "Union",
        "Sound", "Stuck", "Threw", "Unity",
        "South", "Study", "Throw", "Until",
        "Space", "Stuff", "Tight", "Upper",
        "Upset", "Whole", "Waste", "Wound",
        "Urban", "Whose", "Watch", "Write",
        "Usage", "Woman", "Water", "Wrong",
        "Usual", "Train", "Wheel", "Wrote",
        "Valid", "World", "Where", "Yield",
        "Value", "Worry", "Which", "Young",
        "Video", "Worse", "While", "Youth",
        "Virus", "Worst", "White", "Worth",
        "Visit", "Would", "Vital", "Voice"};
       String secretWord = words[(int) (Math.random() * words.length)];
       int maxAttempts = 10;
       Scanner scanner = new Scanner(System.in);
       for (int attempt = 1; attempt <= maxAttempts; attempt++) {
           System.out.print("Attempt " + attempt + "/" + maxAttempts + ": ");
           String guess = scanner.nextLine().toUpperCase();
           if (guess.length() != 5) {
               System.out.println("Please enter a 5-letter word: it can't be that hard to count.");
               attempt--; //don't count invalid input
               continue;
           }


           String result = answerOutput(secretWord, guess);
           System.out.println(result);
           String[] arg = {""};
          
           if (guess.toLowerCase().equals(secretWord.toLowerCase())) {
               System.out.println("Congratulations! You are smarter than a middle schooler!");
               Main.main(arg);
           }
          
           if (attempt == maxAttempts) {
               System.out.println("Wow, you really suck. Just to rub it in your face, the word was " + secretWord + ". Also I am going to end myself since you don't deserve my recommendations");
               System.exit(0);
           }
       }
       scanner.close();
   }


   private static String answerOutput(String secretWord, String guess) {
       String RESET = "\u001B[0m"; //reset
       String RED = "\u001B[31m"; //red
       String GREEN = "\u001B[32m"; //green
       String YELLOW = "\u001B[33m"; //yellow


       String[] feedback = new String[5];
       for (int i = 0; i < 5; i++) {
           feedback[i] = RED + "X" + RESET;
       }
       boolean[] temp = new boolean[5]; //track matched letters


       //checkexact matches
       for (int i = 0; i < 5; i++) {
           if (guess.substring(i, i + 1).toLowerCase().equals(secretWord.substring(i, i + 1).toLowerCase())) {
               feedback[i] = GREEN + "C" + RESET; //correct
               temp[i] = true;
           }
       }
       //check for wrong position matches
       for (int i = 0; i < 5; i++) {
           if (feedback[i].equals(GREEN + "C" + RESET)) continue;
           for (int j = 0; j < 5; j++) {
               if (!temp[j] && guess.substring(i, i + 1).toLowerCase().equals(secretWord.substring(j, j + 1).toLowerCase())) {
                   feedback[i] = YELLOW + "?" + RESET; //wrong position
                   temp[j] = true;
                   break;
               }
           }
       }
       String answ = "";
       for (String let : feedback) {
           answ += let;
       }
       return answ;
   }
}
