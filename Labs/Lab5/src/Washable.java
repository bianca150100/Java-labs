public interface Washable {

        // public static final
        public static final int IMPERVIOUS = 0;
        static int RESISTANT = 1;
        final int FRAGILE = 2;
        public int EXPLOSIVE = 3;


        void wash();

        // public
        default boolean needsWashing() {
            System.out.println("needs");
            return true;
        }

    }


