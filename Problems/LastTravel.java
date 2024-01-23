package Problems;

public class LastTravel {
    public static String solve(String[] cities) {
        String lastCity = cities[0];
        char lastChar = lastCity.charAt(lastCity.length() - 1);
        int travelCount = 1;
        
        while (travelCount < cities.length - 1) {
            for (int i = 0; i < cities.length; i++) {
                String currentCity = cities[i];

                if (lastChar == currentCity.charAt(0)) {
                    System.out.printf("%s -> %s\n", lastCity, currentCity);

                    lastCity = currentCity;
                    lastChar = currentCity.charAt(currentCity.length() - 1);
                }
            }

            travelCount++;
        }

        return lastCity;
    }
}
