package c3_assignments.initializationBlocks;

/*
    ■ Init blocks execute in the order they appear.
    ■ Static init blocks run once, when the class is first loaded.
    ■ Instance init blocks run every time a class instance is created.
    ■ Instance init blocks run after the constructor's call to super().
*/

class InitPapá {
    static {
        System.out.println("1st static initPapá");
    }

    {
        System.out.println("1st instance initPapá");
    }
    
    InitPapá() {
        System.out.println("no-arg constPapá");
    }
}

class Init extends InitPapá{

    Init(int x) {
        System.out.println("1-arg const");
    }

    Init() {
        System.out.println("no-arg const");
    }

    static {
        System.out.println("1st static init");
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        new Init();
        //new Init(7);
    }
}
