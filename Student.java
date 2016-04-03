public class Student {
        private int _id;
        private String _studentName;
        private String _password;
        
        public Student(String _studentName, String _password){
            this._studentName = _studentName;
            this._password = _password;
        }
        public Student() {
            
        }
        
        public int getId() {
            return _id;
        }

        public void setId(int _id) {
            this._id = _id;
        }

        public String getStudentName() {
            return _studentName;
        }

        public void setStudentName(String _studentName) {
            this._studentName = _studentName;
        }

        public String getPassword() {
            return _password;
        }

        public void setPassword(String _password) {
            this._password = _password;
        }