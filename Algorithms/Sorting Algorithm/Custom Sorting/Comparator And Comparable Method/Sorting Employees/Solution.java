class Solution
{
    void sortRecords(node arr[],int n)
    {
         Arrays.sort(arr,(node a, node b)->{
         if(a.salary==b.salary)
         return a.name.compareTo(b.name);
         else 
         return a.salary-b.salary;
        });
    }
}
