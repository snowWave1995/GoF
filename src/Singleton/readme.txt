单利模式就是只声明一个对象的模式，也是23种设计模式中最简单的一种，常用的写法有三种，饿汉，懒汉，双重加锁

饿汉：类初始化的时候就新建一个对象，构造函数私有，外界通过getInstance方法获取实例.

  Class Singleton{
        private static final Singleton s = new Singleton();
        private Singleton(){}
        public staitc Singleton getInsance(){
          return s;
        }
  }
  
  
懒汉：外界调用getInstance方法时，新建一个对象
Class Singleton{
      private static Singleton s = null;
      private Singleton(){}
      public static Singleton getInstance(){
            if(s == null){
              s = new Singleton();
            }
            return s;
      }
}


双重加锁：提高性能，线程安全，
Class Singleton{
    private volatile static Singleton s;    //volatile关键字确保当s被初始化成Singleton实例时，多个线程正确处理s
    private Singleton(){}
    public static Singleton getInstance(){
        if(s == null){
            synchronized (Singleton.class){   //只有第一次声明时，才执行这里的代码，提高了性能。
                if (s == null){
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}
