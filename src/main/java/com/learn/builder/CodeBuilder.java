//package com.learn.builder;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CodeBuilder
//{
//    private String className;
//    private List<Field> fields = new ArrayList<>();
//
//    public CodeBuilder(String className)
//    {
//        this.className = className;
//    }
//
//    public CodeBuilder addField(String name, String type)
//    {
//        fields.add(new Field(type, name));
//        return this;
//    }
//
//    @Override
//    public String toString()
//    {
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("public class ").append(className).append("\n")
//                .append("{")
//                .append("\n");
//
//        for (Field field: fields) {
//            sb.append("  public ").append(field.type).append(" ").append(field.name).append(";").append("\n");
//        }
//        sb.append("}");
//        return sb.toString();
//    }
//}
//
//final class Field {
//    public final String type;
//    public final String name;
//
//    public Field(String type, String name) {
//        this.type = type;
//        this.name = name;
//    }
//}
//
//class Demo {
//    public static void main(String[] args) {
//        CodeBuilder cb = new CodeBuilder("Person")
//                .addField("name", "String")
//                .addField("age", "int");
//        System.out.println(cb);
//    }
//}