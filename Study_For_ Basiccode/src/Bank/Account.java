package Bank;

public class Account {
    public class Test {
        private String cardId;
        private String userName;
        private char sex;
        private String passWord;
        private double monney;
        private double limit; //限额

        public Test(String cardId, String userName, char sex, String passWord, double monney, double limit) {
            this.cardId = cardId;
            this.userName = userName;
            this.sex = sex;
            this.passWord = passWord;
            this.monney = monney;
            this.limit = limit;
        }

        public Test() {
        }

        public String getCardId() {
            return cardId;
        }

        public void setCardId(String cardId) {
            this.cardId = cardId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public double getMonney() {
            return monney;
        }

        public void setMonney(double monney) {
            this.monney = monney;
        }

        public double getLimit() {
            return limit;
        }

        public void setLimit(double limit) {
            this.limit = limit;
        }
    }
}
