/**
 * PullUntilRare
 * Name: ____________________
 * Date: ____________________
 *
 * AI Use Tier: 🤝 AI Co-Pilot
 * AI Attribution (required if you used AI): ____________________
 */
public class App
{
    public static void main(String[] args)
    {
        PullMachine machine = new PullMachine();

        // ===== TODO 1: Pull Until Rare =====
        // Pull until you get a rare item. Count how many pulls it took.
        // Loop I'm using: ____While loop____  Why: __________While there is no rare, keep pulling__________

        int pullsToRare = 0;
        boolean isRare = false;

        // write your loop here

        while(isRare == false){
            pullsToRare ++;
            isRare = machine.pullItem();
        }

        System.out.println("Part 1: It took " + pullsToRare + " pulls to get a rare item.");

        // ===== TODO 2: Exactly 100 Pulls =====
        // Pull exactly 100 times. Count how many were rare.
        // Loop I'm using: ____For loop____  Why: _________For 100 times, pull___________

        int rareCount = 0;
        boolean isItRare = false;

        // write your loop here

        for(int i = 1; i<=100; i++){
            if(isItRare = machine.pullItem()){
                rareCount++;
            }
        }

        System.out.println("Part 2: In 100 pulls, you got " + rareCount + " rare items.");

        // ===== TODO 3: Reflection =====
        // Run your program at least 5 times first. Then answer below in
        // complete sentences. Use these words somewhere: iteration,
        // condition, loop control variable (or counter).
        //
        // 1. Why does a while loop fit Part 1 and a for loop fit Part 2?
        //    What would go wrong if you swapped them?
        //    Answer:
        //
        //    A while loop will repeat only until you get a rare item,
        //    then it will stop, and for loop will go for the amount of times
        //    you set for it no matter what.
        //
        // 2. How did your five runs compare to each other? What surprised you?
        //    Answer:
        //
        //    The amount of times it took to get a rare item and how many rare
        //    items in 100 pulls were completely random and were different
        //    almost every time.  Nothing was particularly surprising.
        //
        // 3. Describe one bug or wrong turn you hit and how you fixed it.
        //    (No bugs? Explain how you checked that your counter was correct.)
        //    Answer:
        //
        //    I completely overlooked the parameter for my for loop, using one
        //    equal sign used for assigning instead of two for checking equality,
        //    I fixed it by using two equal signs.
        //
        // 4. A 5% chance can feel very different depending on how it's
        //    presented. Who benefits when players keep pulling, and who
        //    might be harmed?
        //    Answer:
        //
        //    The creators of the game benefit and players could be harmed
        //    by getting addicted to the game.
        //
    }
}
