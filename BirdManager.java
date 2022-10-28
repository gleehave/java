public class BirdManager {
    void relocate(Bird[] birds){
        for(Bird bird:birds){
            bird.move();
        }
    }
}
