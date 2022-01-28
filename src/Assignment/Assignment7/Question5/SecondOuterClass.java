package Assignment.Assignment7.Question5;


    public class SecondOuterClass {
        class SecondInnerClass extends OuterClass.InnerClass{

            SecondInnerClass(String msg) {
                new OuterClass().super(msg);
            }
        }
    }

