class Badge {
    public String print(Integer id, String name, String department) {

        // Set idString
        String idString = "";
        if (id != null){
            idString = "[" + id + "] - ";
        }

        // Set nameString
        String nameString = name;

        // Set departmentString
        String departmentString;
        if (department != null){
            departmentString = " - " + department.toUpperCase();
        }
        else{
            departmentString = " - OWNER";
        }

        // Return combination
        return idString + nameString + departmentString;
    }
}
