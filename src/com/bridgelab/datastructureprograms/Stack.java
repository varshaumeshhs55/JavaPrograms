package com.bridgelab.datastructureprograms;

public class Stack {
	
        static int top=-1;
        static char items[] = new char[100];

        public static char  push(char x)
        {
            if (top == 99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top] = x;
            }
            return x;
             
        }

        public static char  pop()
        {
            if (top == -1)
            {
                System.out.println("Underflow error");
            }
            else
            {
                char element = items[top];
                top--;
                System.out.println(element);
            }
            return 0;
        }

        boolean isEmpty()
        {
            return (top == -1) ? true : false;
        }
        public static boolean Matching(char character1, char character2)
        {
            if (character1 == '(' && character2 == ')')
                return true;

            else
                return false;
        }

        public static boolean ParenthesisBalanced(char exp[]) {

            Stack stack=new Stack();

            for(int i=0;i<exp.length;i++)
            {

                /*If the exp[i] is a starting
                        parenthesis then push it*/
                if (exp[i] ==  '(')
                    stack.push(exp[i]);

                /* If exp[i] is an ending parenthesis
                         then pop from stack and check if the
                         popped parenthesis is a matching pair*/
                if (exp[i] == ')')
                {
                    if (stack.isEmpty())
                    {
                        return false;
                    }

                    /* Pop the top element from stack, if
                           it is not a pair parenthesis of character
                           then there is a mismatch. This happens for
                           expressions like {(}) */
                    else if ( !Matching(stack.pop(), exp[i]) )
                    {
                        //return false;
                    }
                }

            }

            /* If there is something left in expression
                     then there is a starting parenthesis without
                     a closing parenthesis */

            if (stack.isEmpty())
                return true; /*balanced*/
            else
             /*not balanced*/
                return false;

        

}}
