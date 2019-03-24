package cn.swordPointOffer;

import java.util.Stack;

/**
 * @Author: Nancy
 * @Date: 2019/3/24 12:07
 *
 * 两个栈实现一个队列
 */
public class StackToQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
       stack1.push(node);
    }

    public int pop() {
       if (stack2.empty()){
           while (!stack1.empty()){
               stack2.push(stack1.pop());
           }
       }
       return stack2.pop();
    }
}
