package JavaHomeWork;

public class Rectangle {
        public int rectCover(int target) {
            int fn1 = 1;
            int fn2 = 2;
            int tmp = 0;
            if(target < 1){
                return 0;
            }
            if(target == 1){
                return 1;
            }else if(target == 2){
                return 2;
            }
            for(int i =3;i<=target;i++){
                tmp = fn1 + fn2;
                fn1 = fn2;
                fn2 = tmp;
            }
            return tmp;
        }
    }

