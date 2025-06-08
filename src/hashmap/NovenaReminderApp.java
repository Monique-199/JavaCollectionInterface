package hashmap;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class NovenaReminderApp {
    public static void main(String[] args) {
        HashMap<String,String> novenaMap = new HashMap<>();
        novenaMap.put("Day1", "Petition for Strength");
        novenaMap.put("Day2", "Petition for Guidance");
        novenaMap.put("Day3", "Thanksgiving");
        novenaMap.put("Day4", "Career growth");
        novenaMap.put("Day5", "Petition for Good Health");
        novenaMap.put("Day6", "Prayer for Family");
        novenaMap.put("Day7", "Peace");
        novenaMap.put("Day8", "Happiness");
        novenaMap.put("Day9", "Financial Freedom");
        // 2. Set the start date of the Novena
        LocalDate novenaStartDate = LocalDate.of(2025, 6, 1); // e.g. June 1st, 2025

        // 3. Get today's date
        LocalDate today = LocalDate.now();

        // 4. Calculate the number of days passed
        long daysPassed = ChronoUnit.DAYS.between(novenaStartDate, today);

        // 5. Determine the Novena day
        if (daysPassed < 0) {
            System.out.println("📢 The Novena hasn’t started yet. It begins on " + novenaStartDate + ".");
        } else if (daysPassed >= 0 && daysPassed < 9) {
            String novenaDayKey = "Day" + (daysPassed + 1); // Because Day1 is index 0
            String intention = novenaMap.get(novenaDayKey);
            System.out.println("📅 Today is " + novenaDayKey);
            System.out.println("🙏 Intention: " + intention);
        } else {
            System.out.println("⛪ The 9-day Novena is over. You may start a new one if you wish.");
        }


    }
}
