public class MovieCopyConstructor {
    int duration;
    String name;
    public MovieCopyConstructor(int duration, String name){
        this.name = name;
        this.duration = duration;

    }
    public MovieCopyConstructor(MovieCopyConstructor mymov){
        this.name = mymov.name;
        this.duration = mymov.duration;
    }

    public static void main(String[] args) {
        MovieCopyConstructor mymovie1 = new MovieCopyConstructor(2,"dhamaal");
        MovieCopyConstructor mymovie2  = new MovieCopyConstructor(mymovie1);
        System.out.println(mymovie1.duration);
        System.out.println(mymovie2.duration);
        System.out.println(mymovie1.name);
        System.out.println( mymovie2.name);
        mymovie2.name ="gangajal";
        mymovie2.duration = 5;
        System.out.println(mymovie1.duration);
        System.out.println(mymovie2.duration);
        System.out.println(mymovie1.name);
        System.out.println( mymovie2.name);
//        mymovie1=mymovie2;
//       int dur= mymovie1.duration;
//        System.out.println(dur);





    }

}
