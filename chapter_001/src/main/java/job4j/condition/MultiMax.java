package job4j.condition;

    public class MultiMax {
        public static int max(int first, int second, int third) {
            int result = first>second ? first:second;
            int result2 = result>third?result:third;
            return result2;
        }

}
