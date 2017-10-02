package com.example.administrator.jsq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Stack;

public class MainActivity extends AppCompatActivity  {
    Stack numstack =new Stack();//存放操作数
    Stack opstack = new Stack();//存放操作符


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView out=(TextView)findViewById(R.id.out);
        final TextView in= (TextView)findViewById(R.id.in) ;
        Button button1 =(Button)findViewById(R.id.button1);
        Button button2 =(Button)findViewById(R.id.button2);
        Button button3 =(Button)findViewById(R.id.button3);
        Button button4 =(Button)findViewById(R.id.button4);
        Button button5 =(Button)findViewById(R.id.button5);
        Button button6 =(Button)findViewById(R.id.button6);
        Button button7 =(Button)findViewById(R.id.button7);
        Button button8 =(Button)findViewById(R.id.button8);
        Button button9 =(Button)findViewById(R.id.button9);
        Button button0 =(Button)findViewById(R.id.button0);
        Button buttonadd =(Button)findViewById(R.id.buttonadd);//+
        Button buttonminus =(Button)findViewById(R.id.buttonminus);//-
        Button buttonmultiply =(Button)findViewById(R.id.buttonmultiply);//*
        Button buttondivide =(Button)findViewById(R.id.buttondivide);// /
        Button buttonpoint =(Button)findViewById(R.id.buttonpoint);// .
        Button buttonc =(Button)findViewById(R.id.buttonc);// clear
        Button buttonequal =(Button)findViewById(R.id.buttonequal);//=
        Button buttonback = (Button)findViewById(R.id.buttonback);//back
        Button buttonletf=(Button)findViewById(R.id.buttonleft);
        Button buttonright=(Button)findViewById(R.id.buttonright);
        Button buttonsin=(Button)findViewById(R.id.buttonsin);
        Button buttoncos=(Button)findViewById(R.id.buttoncos);
        Button buttontan=(Button)findViewById(R.id.buttontan);
        Button buttonx2=(Button)findViewById(R.id.buttonx2);
        Button buttonx3=(Button)findViewById(R.id.buttonx3);
        Button buttonloge=(Button)findViewById(R.id.buttonloge);
        Button buttonlog10=(Button)findViewById(R.id.buttonlog10);
        Button buttonsqrt=(Button)findViewById(R.id.buttonsqrt);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("9");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("+");
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("-");
            }
        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("*");
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("/");
            }
        });
        buttonpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append(".");
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.setHint("0");
                in.setText("");
                out.setText("");
            }
        });
        buttonletf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("(");
            }
        });
        buttonright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append(")");
            }
        });
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(in.getText().toString().isEmpty()) {
                    return;
                }
                in.setText(in.getText().subSequence(0,in.getText().length()-1));
            }
        });
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.sin(s);
                out.setText(String.valueOf(s));
            }
        });
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.cos(s);
                out.setText(String.valueOf(s));
            }
        });
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.tan(s);
                out.setText(String.valueOf(s));
            }
        });
        buttonx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.pow(s,2);
                out.setText(String.valueOf(s));
            }
        });
        buttonx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.pow(s,3);
                out.setText(String.valueOf(s));
            }
        });
        buttonloge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    double s=Double.parseDouble(in.getText().toString());
                    s=Math.log(s);
                    out.setText(String.valueOf(s));
            }
        });
        buttonlog10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.log10(s);
                out.setText(String.valueOf(s));
            }
        });
        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double s=Double.parseDouble(in.getText().toString());
                s=Math.sqrt(s);
                out.setText(String.valueOf(s));
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.append("=");
                char[] list = in.getText().toString().toCharArray();
                int head =0;//head 表示开始（包含） last 表示尾（不包含）
                double num=0;
                double r=0;
                char op1,op2,opresult;
                double num1,num2;
                boolean flag =false;//字符标志位
                for (int last=0;last<list.length;last++) {

                    char j = list[last];
                    if (j == '0' || j == '1' || j == '2' || j == '3' || j == '4' || j == '5' || j == '6' || j == '7' || j == '8' || j == '9')
                        flag = false;
                    if (j == '+' || j == '-' || j == '*' || j == '/' || j == '=' || j == '(' || j == ')') {

                        if (opstack.isEmpty()) { //字符栈为空
                            if (j == '(') {
                                head = last + 1;
                                opstack.push(j);
                            } else {
                                if (flag == false) { //有数字
                                    num = getnum(list, head, last);
                                    head = last + 1;
                                    numstack.push(num);//数字 压栈
                                    if (j == '(' || j == ')' || j == '=') {
                                        //错误提示
                                        Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                    } else {
                                        opstack.push(j);
                                    }
                                } else {//没有数字
                                   //错误提示
                                    Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                }
                            }
                        } else {
                            if (flag == false) { //有数字
                                num = getnum(list, head, last);
                                head = last + 1;
                                numstack.push(num);//数字 压栈
                                op1 = opstack.pop().toString().charAt(0);
                                op2 = j;
                                opresult = compare(op1, op2);
                                if (opresult == '>') {// >  运算
                                    num2 = Double.parseDouble(numstack.pop().toString());
                                    num1 = Double.parseDouble(numstack.pop().toString());
                                    //运算
                                    r = value(num1, op1, num2);
                                    if (r != -0.0000000000000001) {
                                        numstack.push(r);//结果压栈
                                    } else {
                                        //错误提示
                                        Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                    }
                                    if (j == '=') {
                                        num2 = Double.parseDouble(numstack.pop().toString());

                                        //                                        if(numstack.isEmpty()){

                                        //                                        }else{
                                        while (numstack.isEmpty() == false) {
                                            op1 = opstack.pop().toString().charAt(0);
                                            while (op1 == '(' || op1 == ')') {
                                                op1 = opstack.pop().toString().charAt(0);
                                            }
                                            //                                            num2=Double.parseDouble(numstack.pop().toString());
                                            num1 = Double.parseDouble(numstack.pop().toString());
                                            //运算
                                            r = value(num1, op1, num2);
                                            if (r != -0.0000000000000001) {
                                                numstack.push(r);//结果压栈
                                                num2 = Double.parseDouble(numstack.pop().toString());
                                                //                                                    op1=opstack.pop().toString().charAt(0);
                                            } else {
                                                //错误提示
                                                Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                            }
                                        }
                                        out.setText(String.valueOf(num2));
                                        //                                        }
                                    } else {
                                        opstack.push(j);
                                    }
                                } else if (opresult == '<') {
                                    opstack.push(op1);
                                    opstack.push(op2);
                                } else if (opresult == '~') {
                                    //错误提示
                                    Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                } else {
                                }
                            } else {//没有数字
                                head= last + 1;
                                op1 = opstack.pop().toString().charAt(0);
                                op2 = j;
                                if (op1 == ')' || op2 == '(' || (op2 == '=' && op1 == ')')) {
                                    if (op2 == '=') {
                                        num2 = Double.parseDouble(numstack.pop().toString());
                                        //                                        op1=
//                                        if (numstack.isEmpty()) {

//                                        } else {
                                            while (numstack.isEmpty()==false){
                                                while (op1 == '(' || op1 == ')') {
                                                    op1 = opstack.pop().toString().charAt(0);
                                                }
                                                num1 = Double.parseDouble(numstack.pop().toString());
                                                //运算
                                                r = value(num1, op1, num2);
                                                if (r != -0.0000000000000001) {
                                                    numstack.push(r);//结果压栈
                                                    num2 = Double.parseDouble(numstack.pop().toString());
                                                } else {
                                                    //错误提示
                                                    Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                                }
                                            }
                                        out.setText(String.valueOf(num2));
//                                        }
                                    } else {
                                        opstack.push(op1);
                                        opstack.push(j);
                                    }

                                } else {
                                    //错误提示
                                    Toast.makeText(MainActivity.this,"出现错误！请检查输入是否正确",Toast.LENGTH_LONG).show();
                                }

                            }

                        }
                        flag = true;
                    }

                }

            }
        });


    }

    //比较操作符
    private char compare(char a,char b){
        if(a == '+' || a == '-'){
            if(b == '*' || b == '/' || b == '(')
                return '<'; //乘除和括号优先级大
            else
                return '>'; //相同优先级前面的优先
        }
        if(a == '*' || a == '/'){
            if(b == '(')
                return '<';
            else
                return '>';
        }
        if(a == '('){
            if(b == ')')
                return '=';
            else
                return '<'; //优先运算括号内的
        }
        if(b == '='){
            return '>';
        }
        return '~';
    }
    //计算
    private double value(double a,char op,double b){
        switch(op){
            case'+':return a + b;
            case'-':return a - b;
            case'*':return a * b;
            case'/':return a / b;
            default:return -0.0000000000000001;
        }
    }
    private double getnum(char[] list,int head,int last){
//        char[] list = textview.getText().toString().toCharArray();
//        int head =0;//head 表示开始（包含） i 表示尾（不包含）
        double r=0;
//       for (int i=0;i<list.length;i++) {

//            char j = list[last];
        //           if(j=='+'||j=='-'||j=='*'||j=='/'||j=='='){
        //取出数组中【）中的内容
        char[] temp_list= Arrays.copyOfRange(list,head,last);
//                head=last+1;//改变头 确定下一个范围的头
        String result=String.valueOf(temp_list);//char数组转String 或 String result =new String(temp_list);
        // textview.append(result+"  ");
        r=Double.parseDouble(result);//string 转double

        //           }
        //      }
        return  r;
    }
//    private char getop(char[] list,int head,int last){
//        char j = list[last];
//    }

}
