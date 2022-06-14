class FindDay {
    public static String findDay(int month, int day, int year) {
        int Y1 = year % 100;
        int Y2 = year - (Y1 * 100);
        int Day = day + ((13 * month - 1) / 5) + Y2 + (Y2 / 4) + (Y1 / 4) - 2 * Y1;
        switch (Day) {
            case 0: {
                return "SUNDAY";

            }
            case 1: {
                return "MONDAY";
            }
            case 2: {
                return "TUESDAY";
            }
            case 3: {
                return "WEDNESDAY";

            }
            case 4: {
                return "THURSDAY";

            }
            case 5: {
                return "FRIDAY";

            }
            case 6: {
                return "SATURDAY";

            }
            default: {
                return "";
            }
        }
    }
}