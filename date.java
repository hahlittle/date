public class T5 {
    public static void main(String[] args) {
        Date date = new Date();
        long dateTime = date.getTime();
        String newDateString = "2023-01-22 00:00:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
        try {
            Date newYearDate = simpleDateFormat.parse(newDateString);
            long newYearDateTime = newYearDate.getTime();
            long result = newYearDateTime - dateTime;
            long dayNums = result / 1000 / 60 / 60 / 24;
            System.out.println(dayNums);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
