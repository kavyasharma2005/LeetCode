class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        int[] count = new int[2];

        // Count students who prefer each type
        for (int student : students) 
        {
            count[student]++;
        }

        // Process sandwiches from top to bottom
        for (int sandwich : sandwiches) 
        {

            // No student wants this sandwich
            if (count[sandwich] == 0) 
            {
                break;
            }

            // One student takes the sandwich
            count[sandwich]--;
        }

        // Remaining students
        return count[0] + count[1];
    }
}