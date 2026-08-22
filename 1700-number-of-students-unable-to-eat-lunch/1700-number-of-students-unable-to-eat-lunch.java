class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer>st=new Stack<>();
        Queue<Integer>q=new LinkedList<>();
        int count=0;
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        for(int i=0;i<sandwiches.length;i++){
            st.push(sandwiches[sandwiches.length - 1 - i]);
        }
    while(!st.isEmpty()&&!q.isEmpty()){
        if(st.peek()==q.peek()){
            st.pop();
            q.remove();
            count=0;
        }
        else{
            q.add(q.remove());
            count++;
            if(count==q.size()){
                break;
            }
            
        }
    }
    
        return q.size();
    }
}