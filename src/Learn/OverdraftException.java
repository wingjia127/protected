package Learn;
class OverdraftException extends Exception{

        private double deficit;
        public  OverdraftException(){

        }
        public OverdraftException(String msg,double deficit){
            super(msg+deficit);
        }

        public double getDeficit() {
            return deficit;
        }

}
