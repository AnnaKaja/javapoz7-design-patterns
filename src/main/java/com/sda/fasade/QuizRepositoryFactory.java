package com.sda.fasade;

public class QuizRepositoryFactory {
    public QuizRepository createRepository(String repositoryType){
        if ("test".equals(repositoryType)){
            return new QuizSampleRepository();
        }else if ("production".equals(repositoryType)){
            return new QuizFileRepository("test.txt");
        }
        return null;
    }
}
