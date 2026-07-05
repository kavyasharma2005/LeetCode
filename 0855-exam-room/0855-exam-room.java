class ExamRoom {

    private int n;
    private TreeSet<Integer> seats;

    public ExamRoom(int n) 
    {
        this.n = n;
        seats = new TreeSet<>();
    }

    public int seat() {

        // First student
        if (seats.isEmpty()) 
        {
            seats.add(0);
            return 0;
        }

        int student = 0;
        int dist = seats.first();

        Integer prev = null;

        for (Integer curr : seats) 
        {

            if (prev != null) 
            {

                int d = (curr - prev) / 2;

                if (d > dist) 
                {
                    dist = d;
                    student = prev + d;
                }
            }

            prev = curr;
        }

        if (n - 1 - seats.last() > dist) 
        {
            student = n - 1;
        }

        seats.add(student);
        return student;
    }

    public void leave(int p) 
    {
        seats.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */