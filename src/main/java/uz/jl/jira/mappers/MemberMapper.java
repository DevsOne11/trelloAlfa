package uz.jl.jira.mappers;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  09:26   20/06/22
 * @Project :  trelloAlfa
 */
public class MemberMapper implements BaseMapper {

    private static MemberMapper instance;

    public static MemberMapper getInstance() {
        if (instance==null){
            instance = new MemberMapper();
        }
        return instance;
    }

}
