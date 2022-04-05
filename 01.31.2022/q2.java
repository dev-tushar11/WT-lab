class loan {
    int loanAmt_119;

    void getData(int i) {
        loanAmt_119 = i;
    }

    void display() {
        System.out.println("Loan amount = " + loanAmt_119);
    }

    float calcInterest() {
        float interest_119 = 0;
        if (loanAmt_119 <= 7000) {
            interest_119 = ((loanAmt_119 * 6 * 1) / 100.0f);
        } else if (loanAmt_119 >= 7001 && loanAmt_119 <= 10000) {
            interest_119 = ((loanAmt_119 * 8 * 1) / 100.0f);
        } else {
            interest_119 = ((loanAmt_119 * 10 * 1) / 100.0f);
        }

        return interest_119;
    }
}

class q2 {
    public static void main(String[] args) {
        loan l1 = new loan();
        l1.getData(7060);
        l1.display();
        System.out.println("interest = " + l1.calcInterest());
    }
}
