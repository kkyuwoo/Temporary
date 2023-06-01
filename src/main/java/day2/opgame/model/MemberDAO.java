package day2.opgame.model;

import java.sql.SQLException;
import java.util.Optional;

public class MemberDAO extends BaseDAO {
    public void initMember() {
        String sql = """
                create table opg_member (
                seq integer primary key autoincrement,
                id text NOT NULL,
                pw text NOT NULL,
                islogined integer default '0',
                created_at text default current_timestamp,
                updated_at text default current_timestamp
                )
                """;
        try {
            getConn();
            smt = conn.createStatement();

            smt.executeUpdate("drop table if exists opg_member");
            smt.executeUpdate(sql);
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }

    public Optional<Member> login(String id, String pw) {
        String sql = """
                update opg_member set islogined='1' where id=? and pw=?
                """;
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pw);
            int cnt = psmt.executeUpdate();
            if (cnt > 0) {
                psmt = conn.prepareStatement("select id, islogined from opg_member where id=?");
                psmt.setString(1, id);
                psmt.executeQuery();
                if (rs.next()) {
                    String rid = rs.getString(1);
                    boolean risLogined = rs.getBoolean(2);
                    return Optional.of(new Member(rid, risLogined));
                }
            }
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
        return Optional.empty();
    }

    public int join(String id, String pw) {
        int cnt = 0;
        String sql = "insert into person(id, pw) values(?, ?)";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pw);
            cnt = psmt.executeUpdate();
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
        return cnt;
    }

    public Optional<Member> logout(String id) {
        String sql = """
                update opg_member set islogined='0' where id=?
                """;
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, id);
            int cnt = psmt.executeUpdate();
            if (cnt > 0) {
                psmt = conn.prepareStatement("select id, islogined from opg_member where id=?");
                psmt.setString(1, id);
                psmt.executeQuery();
                if (rs.next()) {
                    String rid = rs.getString(1);
                    boolean risLogined = rs.getBoolean(2);
                    return Optional.of(new Member(rid, risLogined));
                }
            }
        } catch(SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
        return Optional.empty();
    }
}