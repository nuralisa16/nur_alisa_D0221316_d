/*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Calendar calendar = new GregorianCalendar(year, month-1,          day);
        String hari = sdf.format(calendar.getTime());
        hari = hari.toUpperCase();
        return hari;
    }

}
