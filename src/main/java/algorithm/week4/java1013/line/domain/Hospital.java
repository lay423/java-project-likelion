package algorithm.week4.java1013.line.domain;

public class Hospital {
    private String id;
    private String address;
    private String district;
    private String category;
    private int emergency_room;
    private String name;
    private String subdivision;

    public Hospital(String id) {
        this.id = id;
    }

    public Hospital(String id, String address, String district, String category, int emergency_room, String name, String subdivision) {
        this.id = id;
        this.address = address;
        this.district = district;
        this.category = category;
        this.emergency_room = emergency_room;
        this.name = name;
        this.subdivision = subdivision;
    }

    public String getSqlInsertquery3(){
        return "(\'"+this.getId() + "\',\'"
                + this.getAddress() + "\',\'"
                + this.getDistrict() + "\',\'"
                + this.getCategory() + "\',"
                + this.getEmergency_room() + ",\'"
                + this.getName() + "\',"
                + this.getSubdivision()
                + "),\n";
    }

    public String getSqlInsertquery2() {
        String sql = String.format("INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\nVALUES" +
                "(\'%s\',\n" +
                "(\'%s\',\n" +
                "(\'%s\',\n" +
                "(\'%s\',\n" +
                "(\'%d\',\n" +
                "(\'%s\',\n" +
                "(%s);\n",
                this.getId(), this.getAddress(), this.getDistrict(),
                this.getCategory(), this.getEmergency_room(),
                this.getName(), this.getSubdivision());
        return sql;
    }

    public String getSqlInsertquery() {
        String sql = String.format("INSERT INTO `hospital`.`seoul_hospital`\n" +
                "(`id`,\n" +
                "`address`,\n" +
                "`district`,\n" +
                "`category`,\n" +
                "`emergency_room`,\n" +
                "`name`,\n" +
                "`subdivision`)\nVALUES" + "(\'" + this.getId() + "\',\'"
                + this.getAddress() + "\',\'"
                + this.getDistrict() + "\',\'"
                + this.getCategory() + "\',"
                + this.getEmergency_room() + ",\'"
                + this.getName() + "\',"
                + this.getSubdivision()
                + ");\n");
        return sql;
    }

    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getDistrict() {
        return district;
    }

    public String getCategory() {
        return category;
    }

    public int getEmergency_room() {
        return emergency_room;
    }

    public String getName() {
        return name;
    }

    public String getSubdivision() {
        return subdivision;
    }
}
