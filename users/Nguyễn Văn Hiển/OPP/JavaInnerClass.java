/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1811e.java.OPP;

/**
 *
 * @author PC
 */
abstract class AnonymousInner {
    abstract void show();
}
interface AnonymousInterface {
    void show();
}

class JavaInnerClass {
    
    class MemberInner {
        void show() {
            System.out.println("This is member inner class");
        }
    }
    class MemberInner2 {
        void show() {
            System.out.println("This is member inner class 2");
        }
    }
    
    void showLocalInner() {
        class LocalInner {
            void show() {
                System.out.println("This is local inner class");
            }
        }
        LocalInner local = new LocalInner();
        local.show();
    }
    
    public static void main(String[] args) {
        JavaInnerClass obj = new JavaInnerClass();
        
        JavaInnerClass.MemberInner var_name = obj.new MemberInner();
        var_name.show();
        
        JavaInnerClass.MemberInner2 var_name_2 = obj.new MemberInner2();
        var_name_2.show();
        
        AnonymousInner obj2 = new AnonymousInner() {
            @Override
            void show() {
                System.out.println("This is anonymous inner class");
            }
        };
        obj2.show();
        
        AnonymousInterface obj3 = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("This is anonymous inner interface");
            }
        };
        obj3.show();
        
        obj.showLocalInner();
        
    }
}
