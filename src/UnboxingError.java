class UnboxingError {
    public static void main(String args[]) {
        Integer iOb = 1000;
        // int i = iOb.byteValue();
        int i = iOb.intValue();
        System.out.println(i);
    }
}