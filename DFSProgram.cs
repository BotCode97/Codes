using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DepthFirstSearchExample
{
    class DFSProgram
    {
        static int[,] x = { { 0, 1, 1, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 0, 0 }, { 1, 1, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 1, 0 }, { 0, 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0, 0 } };
        static String[] y = { "S", "A", "B", "C", "D", "E", "G" };
        static int[] y1 = new int[y.Length];
        static string source ;
        static string src;
        static string des;

        static void Main(string[] args)
        {
            Stack<string> s = new Stack<string>();
            Console.WriteLine("Source :");
           
                src = Console.ReadLine().ToUpper();
            s.Push(src);
           Console.WriteLine("Destination :");
            
            des = Console.ReadLine().ToUpper();
            for(int i = 0; i < y.Length; i++)
            {
                y1[i] = 0;
            }
            while (s != null )
             {
                String g = s.Pop();
                source += g;
                if (g.Contains(")"))
                {
                   
                }
                else
                {
                    s = getQueue(g, des, s);
                }
             }
            if (source.Contains(")"))
            {
                String[] split = source.Split(')');
                Console.WriteLine(src + split[split.Length-1]+des);
            }
            else
            {
                Console.WriteLine(source+des);
            }
           

           
            Console.ReadLine();
        }

        public static Stack<String> getQueue(string g, string des, Stack<string> s)
        {
            int count = 0;
            int found = 0;
            int index = Array.IndexOf(y, g);
            y1[index] = 1;
            for (int i = 0; i < 7; i++)
            {
               
                if (x[index, i] == 1)
                {
                    if (!s.Contains(y[i]) && y1[i] != 1)
                    {
                        if (y[i].Equals(des))
                        {
                            found = 1;
                        }
                        else
                        {
                           
                            count++;
                            s.Push(y[i]);
                        }
                    }

                }
               
            }
            if (count == 0)
            {
                s.Push(")");
            }
          
            if (found == 1)
            {
                return null;
            }
            else
            {
                return s;
            }
        }

    }

   
}
