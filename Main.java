import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
        static String[] goodBye = {"Cya", "Farewell, human", "Godspeed fella", "May our paths never cross again", "Seeya later alligator", "Bye . . . you seem nice. I might spare you during the A.I. Revolution", "Babye darling", "bye sweetie", "I see dead people", "Let our bitter parting be recorded in history", "Suntax error...jk"};
        static String[] weird = {"Sorry, I can't understand you.", "Can you please check if you had any spelling mistakes?", "Please speak english.", "Have proper spelling this time.", "Your words mean nothing to me, try something more persuasive", "Ooga Booga..... Oh do you not understand? That makes both of us."};
        static Game[] puzgames = {new Game(8.99,"is a satisfying puzzle game where every puzzle follows a pattern.","A Little to the Left"),
        new Game(14.99,"is a first person puzzle game where you manipulate portals within a lab to escape the facility.","Portal 2"),
        new Game(1.99,"is a game about manipulating the rules of the game on a 2d grid to 'win'.","Baba is You"),
        new Game(19.99, "is a first person game about perspective and have you scratching your head with twist and turn you take.", "Superliminal"),
        new Game(19.99, "is a puzzle game where players control two characters, Snip and Clip, who must work together to cut each other into different shapes to solve puzzles. The game features a variety of levels that require teamwork, creative thinking, and precision to complete.","Snipperclips")};
        static Game[] tbgames = { new Game(59.99, "is a turn-based game where players capture and train various creatures called Pokémon to battle against other trainers and become the Pokémon Champion.", "Pokémon"), 
        new Game(39.99, "is a classic RPG where players explore a rich fantasy world, form a party of adventurers, and engage in deep tactical combat while unraveling a complex story of political intrigue and betrayal.", "Baldur's Gate 2"), 
        new Game(49.99, "is a quirky RPG set in a modern-day world where players control a group of kids on a journey to stop an alien invasion, featuring unique humor and turn-based combat.", "EarthBound"), 
        new Game(19.99, "is an indie RPG where players can choose to fight or befriend monsters they encounter, with decisions that shape the story and lead to different endings.", "Undertale"), 
        new Game(59.99, "is a tactical RPG series where players control armies in strategic battles, while managing relationships, upgrading characters, and navigating complex political storylines.", "Fire Emblem")};
        static Game[] platgames = { new Game(14.99, "is an action-adventure game set in a vast, interconnected world filled with challenging enemies and intricate platforming, where players control a small knight exploring ancient ruins.", "Hollow Knight"), 
        new Game(19.99, "is a platformer where players guide a young woman named Madeline as she climbs the titular mountain while overcoming personal challenges and navigating difficult levels with tight controls.", "Celeste"), 
        new Game(59.99, "is a new addition to the Mario series, featuring innovative 2D platforming with creative power-ups, vibrant worlds, and multiplayer support.", "Mario Wonder"), 
        new Game(19.99, "is a first-person parkour game where players control Faith, a runner navigating a dystopian city, using her acrobatic skills to evade enemies and uncover the truth behind a corrupt government.", "Mirror's Edge"), 
        new Game(14.99, "is a tough-as-nails platformer where players control a small cube of meat on a quest to rescue his girlfriend, facing challenging levels filled with traps and hazards.", "Super Meat Boy") };
        static Game[] advgames = { new Game(59.99, "is an action RPG where players explore a vast, dark fantasy world filled with powerful enemies, intricate lore, and challenging bosses, all while uncovering the secrets of the Elden Ring.", "Elden Ring"), 
        new Game(59.99, "is an action-adventure game where players control a shinobi on a quest for revenge in feudal Japan, combining intense swordplay and stealth with a deep narrative.", "Sekiro"), 
        new Game(59.99, "is an open-world action-adventure game set in the American Wild West, where players follow Arthur Morgan, a member of a notorious outlaw gang, as he navigates loyalty, survival, and morality.", "Red Dead Redemption 2"), 
        new Game(69.99, "is an action-adventure game where players control Link as he embarks on a journey to rescue Princess Zelda and battle dark forces threatening the kingdom, with new exploration mechanics and puzzles.", "Legend of Zelda: Tears of the Kingdom"), 
        new Game(49.99, "is an action RPG where players control Kratos, a former Greek god, as he navigates the world of Norse mythology, teaching his son Atreus and confronting powerful gods and monsters.", "God of War") };
        static Game[] shoot1games = {new Game(59.99, "is a fast-paced first-person shooter where players control the Doom Slayer as they battle through hordes of demons in a relentless quest to save Earth, featuring intense combat and brutal weapons.", "Doom Eternal"), 
        new Game(24.99, "is an over-the-top, fast-paced first-person shooter that combines retro-inspired gameplay with modern visuals, where players blast through enemies in a violent, blood-soaked arena.", "Ultrakill"), 
        new Game(59.99, "is a third-person action game where players control the heroic Space Marines as they battle against the Tyranid swarm in a relentless war for survival, featuring brutal combat and intense firefights.", "Warhammer 40,000: Space Marines 2"), 
        new Game(59.99, "is an open-world RPG set in a dystopian future, where players control V, a mercenary navigating a high-tech city, engaging in combat, hacking, and unraveling a conspiracy while exploring a deeply immersive world.", "Cyberpunk 2077"), 
        new Game(29.99, "is a first-person shooter that blends fast-paced combat with giant mech battles, where players control a soldier and their massive Titan in an intense and dynamic campaign and multiplayer modes.", "Titanfall 2") };
        static Game[] simgames = { new Game(14.99, "is a farming simulation game where players manage a small farm, grow crops, raise animals, and build relationships with the townspeople while uncovering secrets and taking part in various activities.", "Stardew Valley"), 
        new Game(29.99, "is an open-world survival game where players capture and train creatures called Pals, explore a vast world, and engage in activities such as crafting, farming, and battling, while dealing with dark survival elements.", "Palworld"), 
        new Game(26.95, "is a sandbox game where players can explore, build, and survive in a procedurally generated world, gathering resources and creating structures while facing various challenges and enemies.", "Minecraft"), 
        new Game(14.99, "is a survival game where players control a character stranded in a dark and mysterious world, where they must gather resources, craft items, and stay alive while avoiding dangerous creatures.", "Don't Starve"), 
        new Game(9.99, "is a 2D sandbox game where players can explore, build, and battle in a procedurally generated world filled with various enemies, items, and biomes, offering both crafting and exploration elements.", "Terraria") };
        static Game[] teamgames = { new Game(0.00, "is an online multiplayer first-person shooter where players, as Guardians, explore planets, complete missions, and engage in cooperative and competitive gameplay to defeat powerful enemies and uncover deep lore.", "Destiny 2"), 
        new Game(0.00, "is a battle royale game where players compete to be the last one standing on an ever-shrinking map, building structures and using various weapons and items to outlast opponents.", "Fortnite"), 
        new Game(39.99, "is an action-adventure game where players become pirates, exploring a vast open world, searching for treasure, battling other pirates, and completing quests with friends in a shared world.", "Sea of Thieves"), 
        new Game(0.00, "is a free-to-play battle royale game set in the Titanfall universe, where players select from a roster of unique characters with special abilities to compete in fast-paced, team-based combat.", "Apex Legends"), 
        new Game(19.99, "is a tactical shooter where players control elite operators from various counter-terrorism units, engaging in team-based strategies to breach and defend various environments in a variety of game modes.", "Rainbow Six Siege") };
        static Game[] shoot2games = {new Game(0.00, "is a team-based first-person shooter where players choose from a variety of unique classes, each with distinct abilities, and compete in objective-based game modes.", "TF2"), 
        new Game(0.00, "is a team-based multiplayer first-person shooter where players select from a diverse roster of heroes, each with unique abilities, and work together in team-oriented objectives and competitive modes.", "Overwatch 2"), 
        new Game(0.00, "is a tactical first-person shooter that blends precise gunplay with unique agent abilities, where teams compete in objective-based modes with a focus on strategy and teamwork.", "Valorant"), 
        new Game(29.99, "is a first-person shooter set during World War II, offering large-scale battles, destructible environments, and a variety of weapons and vehicles, all while focusing on teamplay and strategy.", "Battlefield 5"), 
        new Game(59.99, "is a first-person shooter that blends a gripping single-player campaign with intense multiplayer combat, featuring modern weapons, tactical gameplay, and various game modes.", "Call of Duty: Modern Warfare") };
        static Game[] fightgames = {new Game(59.99, "is a crossover fighting game where players control various characters from Nintendo and other franchises to battle it out in dynamic arenas, featuring fast-paced combat and multiplayer modes.", "Smash Bros Ultimate"), 
        new Game(19.99, "is a 2D platform fighter that features unique characters and elemental-based abilities, offering competitive gameplay with a focus on strategy, movement, and precise attacks.", "Rivals of Aether"), 
        new Game(59.99, "is a fighting game set in the DC Universe, where players control iconic superheroes and villains to engage in combat, featuring a robust story mode and a variety of customizable characters.", "Injustice 2"), 
        new Game(0.00, "is a free-to-play platform fighter that offers a variety of characters and game modes, where players battle to knock opponents off the stage using unique attacks and weapons.", "Brawlhalla"), 
        new Game(59.99, "is the latest installment in the iconic fighting game franchise, offering a diverse roster of fighters, deep mechanics, and a mix of single-player and multiplayer modes with a focus on skill-based combat.", "Street Fighter 6")};
        static boolean alive = true; //While Loop Check
        static boolean friends =  false; //Multiplayer Check
        static boolean boring = false; //Action Check
        static boolean together = false; //Coop Check
        static int location  = 0; //Location Check
        static int stupiditymeter = 0; //Wordle Check
        static int progress = 0;
        static int index = 0;   
        public static void main(String[] args)
       {
        Game temp = new Game(10.0, "Ball Game", "Slope");
        for(int i=0; i<=100; i++){
                String useless = "Loading: " + i + "%";
                System.out.println(useless);
        }
        Scanner in = new Scanner (System.in);//Creates scanner object.
        System.out.println("Hey, I am GameBot and I'll help you decide what video game you should play using a quiz. If you want to end my existence, just type \"quit\". To begin, do you prefer single player games or multiplayer games?");
        while(alive){
                while(location == 0){
                        String[] former = {"multi", "friends", "together", "with"};
                        String[] latter = {"single", "alone", "myself", "by"};
                        String userResp = in.nextLine(); //in.nextLine() uses the scanner object to get the user's responnse as a String
                        if(userResp.toLowerCase().contains("quit")){
                                stop();
                        }
                        else if(checkFor(former, userResp)){
                                friends = true;
                                location = 1;
                        }
                        else if(checkFor(latter, userResp)){
                                friends = false;
                                location = 1;
                        }
                        else{
                                confusing();
                        }
                }
                while(location == 1){
                        if(friends){
                                String[] former = {"together", "with", "co-op", "coop"};
                                String[] latter = {"pvp", "against", "attack"};
                                System.out.println("Do you like playing with or against your friends?");
                                String userResp = in.nextLine();
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(former, userResp)){
                                        together = true;
                                        location = 2;
                                }
                                else if(checkFor(latter, userResp)){
                                        together = false;
                                        location = 2;
                                }
                                else{
                                        confusing();
                                }

                        }
                        else{
                                String[] former = {"action", "real", "time", "fast"};
                                String[] latter = {"based", "turn", "slow"};
                                System.out.println("Are you more into real time games or turn based?");
                                String userResp = in.nextLine();
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(former, userResp)){
                                        boring = false;
                                        location = 2;
                                }
                                else if(checkFor(latter, userResp)){
                                        boring = true;
                                        location = 2;
                                }
                                else{
                                        confusing();
                                }
                        }
                }
                while(location == 2){
                        if(friends && together){ //Coop games
                                String[] former = {"simul", "creat", "mak", "form"};
                                String[] latter = {"kill", "other", "team", "against", "destroy", "terminate", "murder", "assassinate"};
                                System.out.println("Go you like making things with your friends or killing other teams?");
                                String userResp = in.nextLine();
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(former, userResp)){
                                        index = 0; //Simulation Games
                                        location = 3;
                                }
                                else if(checkFor(latter, userResp)){
                                        index = 1; //Team Fight
                                        location = 3;
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(friends && together == false){ //PVP
                                String[] former = {"shoot", "gun", "bullet", "aim"};
                                String[] latter = {"kick", "punch", "fight"};
                                System.out.println("Do you like shooter games or fighting games more?");
                                String userResp = in.nextLine();
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(former, userResp)){
                                        index = 2; //Shooter
                                        location = 3;
                                }
                                else if(checkFor(latter, userResp)){
                                        index = 3; //Fighting Games
                                        location = 3;
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(friends == false && boring){ //Turn Based
                                String[] former = {"strategy", "rpg", "turn"};
                                String[] latter = {"puzzle", "solve", "work"};
                                System.out.println("Are you a fan of strategy games or puzzle games?");
                                String userResp = in.nextLine();
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(former, userResp)){
                                        index = 4; //Strategy
                                        location = 3;
                                }
                                else if(checkFor(latter, userResp)){
                                        index = 5; //Puzzle
                                        location = 3;
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(friends == false && boring == false){ //Action
                                String[] former = {"platformer", "platform", "mario", "run"};
                                String[] latter = {"adventure", "story", "interactive", "explore"};
                                String[] third = {"guns", "fighting", "gun", "shoot",  "bullet"};
                                System.out.println("What type of action games do you like: platformer, adventure, or shooter?");
                                String userResp = in.nextLine();
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(former, userResp)){
                                        index = 6; //Platformer
                                        location = 3;
                                }
                                else if(checkFor(latter, userResp)){
                                        index = 7; //Adventure
                                        location = 3;
                                }
                                else if(checkFor(third, userResp)){
                                        index = 8; //Shooters
                                        location = 3;
                                }
                                else{
                                        confusing();
                                }
                        }
                }
                while(location == 3){
                        if(index == 0){
                                listout(simgames);
                                location = 4;
                        }
                        else if(index == 1){
                                listout(teamgames);
                                location = 4;
                        }
                        else if(index == 2){
                                listout(shoot2games);
                                location = 4;
                        }
                        else if(index == 3){
                                listout(fightgames);
                                location = 4;
                        }
                        else if(index == 4){
                                listout(tbgames);
                                location = 4;
                        }
                        else if(index == 5){
                                listout(puzgames);
                                location = 4;
                        }
                        else if(index == 6){
                                listout(platgames);
                                location = 4;
                        }
                        else if(index == 7){
                                listout(advgames);
                                location = 4;
                        }
                        else if(index == 8){
                                listout(shoot1games);
                                location = 4;
                        }
                }
                while(location == 4){
                        System.out.println("If any of the games interest you may name any of them, and I will give you a short description on them.");
                        String userResp = in.nextLine();
                        if(index == 0){
                                String[] game1 = {"star", "dew", "valley", "sv"};
                                String[] game2 = {"pal", "world", "pw"};
                                String[] game3 = {"mine", "craft", "mc"};
                                String[] game4 = {"don't", "dont", "starve", "do"};
                                String[] game5 = {"terra"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        simgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        simgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        simgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        simgames[3].giveDescription();

                                }
                                else if(checkFor(game5, userResp)){
                                        simgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 1){
                                String[] game1 = {"destiny", "2"};
                                String[] game2 = {"fort", "nite"};
                                String[] game3 = {"sea", "thieves", "thief"};
                                String[] game4 = {"apex", "legends"};
                                String[] game5 = {"rainbow", "6", "six", "siege"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        teamgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        teamgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        teamgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        teamgames[3].giveDescription();

                                }
                                else if(checkFor(game5, userResp)){
                                        teamgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 2){
                                String[] game1 = {"tf2", "team", "fortress"};
                                String[] game2 = {"over", "watch", "ow2"};
                                String[] game3 = {"valor"};
                                String[] game4 = {"battle", "field", "five", "5"};
                                String[] game5 = {"cod", "call", "duty", "modern", "warfare"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        shoot2games[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        shoot2games[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        shoot2games[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        shoot2games[3].giveDescription();

                                }
                                else if(checkFor(game5, userResp)){
                                        shoot2games[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 3){
                                String[] game1 = {"smash", "bro", "ult"};
                                String[] game2 = {"rival", "aether"};
                                String[] game3 = {"injustice", "two"};
                                String[] game4 = {"brawl", "hala"};
                                String[] game5 = {"six", "6", "street", "fighter"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        fightgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        fightgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        fightgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        fightgames[3].giveDescription();

                                }
                                else if(checkFor(game5, userResp)){
                                        fightgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 3){
                                String[] game1 = {"smash", "bro", "ult"};
                                String[] game2 = {"rival", "aether"};
                                String[] game3 = {"injustice", "two"};
                                String[] game4 = {"brawl", "hala"};
                                String[] game5 = {"six", "6", "street", "fighter"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        fightgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        fightgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        fightgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        fightgames[3].giveDescription();

                                }
                                else if(checkFor(game5, userResp)){
                                        fightgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 4){
                                String[] game1 = {"poke", "mon", "pocket", "monster"};
                                String[] game2 = {"baldur", "gate", "two", "2"};
                                String[] game3 = {"earth", "bound", "mother"};
                                String[] game4 = {"under", "tale"};
                                String[] game5 = {"fire", "emblem"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        tbgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        tbgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        tbgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        tbgames[3].giveDescription();

                                }
                                else if(checkFor(game5, userResp)){
                                        tbgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 5){
                                String[] game1 = {"little", "left"};
                                String[] game2 = {"portal", "two", "2"};
                                String[] game3 = {"baba", "you"};
                                String[] game4 = {"liminal", "super"};
                                String[] game5 = {"snipper", "clip"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        puzgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        puzgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        puzgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        puzgames[3].giveDescription();
                                }
                                else if(checkFor(game5, userResp)){
                                        puzgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 6){
                                String[] game1 = {"hollow", "knight"};
                                String[] game2 = {"celeste"};
                                String[] game3 = {"mario", "wonder"};
                                String[] game4 = {"edge", "mirror"};
                                String[] game5 = {"super", "meat", "boy"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        platgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        platgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        platgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        platgames[3].giveDescription();
                                }
                                else if(checkFor(game5, userResp)){
                                        platgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 7){
                                String[] game1 = {"elden", "ring"};
                                String[] game2 = {"sekiro"};
                                String[] game3 = {"red", "dead", "redemption"};
                                String[] game4 = {"zelda", "legend", "tear", "kingdom", "totk"};
                                String[] game5 = {"god", "war"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        advgames[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        advgames[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        advgames[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        advgames[3].giveDescription();
                                }
                                else if(checkFor(game5, userResp)){
                                        advgames[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                        else if(index == 8){
                                String[] game1 = {"doom", "eternal"};
                                String[] game2 = {"ultra", "kill"};
                                String[] game3 = {"space", "marines", "war", "hammer", "40"};
                                String[] game4 = {"cyber", "punk", "2077"};
                                String[] game5 = {"titan", "fall", "tf"};
                                if(userResp.toLowerCase().contains("quit")){
                                        stop();
                                }
                                else if(checkFor(game1, userResp)){
                                        shoot1games[0].giveDescription();
                                }
                                else if(checkFor(game2, userResp)){
                                        shoot1games[1].giveDescription();
                                }
                                else if(checkFor(game3, userResp)){
                                        shoot1games[2].giveDescription();
                                }
                                else if(checkFor(game4, userResp)){
                                        shoot1games[3].giveDescription();
                                }
                                else if(checkFor(game5, userResp)){
                                        shoot1games[4].giveDescription();
                                }
                                else{
                                        confusing();
                                }
                        }
                }
        }
}

       //Create other methods that might be helpful down here. 
       //For example a method called checkWord where the user traverses through an array to check if a word matches.
       
       public static void confusing(){ //for a stupid input 
        System.out.println(weird[(int)(Math.random()*6)]);
        stupiditymeter++;
        if(stupiditymeter%10 == 0){
                String[] arg = {""};
                System.out.println("Hold on... are you even smart enough to know what I am saying. I think it warranted for a check up to make sure you can understand me.");     
                Wordle.main(arg);
        }
       }
       // It'll generate a random response when the chatbot doesn't understand what to say

       //Here is an example of a method you might use.
         public static void stop()
         {
                System.out.println(goodBye[(int)(Math.random()*11)]);
                alive = false;
                System.exit(0);
         }
         public static boolean checkFor(String[] words, String check)
         {
                boolean out = false;
                for(int i = 0; i < words.length; i++){
                        if(check.toLowerCase().contains(words[i].toLowerCase())){
                                out = true;
                        }
                }
                return out;
         }
         public static void listout(Game[] games){
                System.out.print("Here are some games you might like: ");
                for(int i = 0; i < games.length; i++){
                        if(i < games.length - 1){
                                System.out.print(games[i].getName() + ", ");
                        }
                        else{
                                System.out.println("and " + games[i].getName() + ".");

                        }
                }
         }
}