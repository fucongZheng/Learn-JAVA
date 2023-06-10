package com.fucongzheng.chooce;

public class switch_choice {
    public static void main(String[] args) {

        /*
        格式 switch(expression){
            case value:
            break
            default
        case 穿透
        }

         */
        char grad ='C';
        switch (grad){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("一般");
                break;
            case 'D':
                System.out.println("努力");
                break;
            default:
                System.out.println("挂科");
        }
    }
}
