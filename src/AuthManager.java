/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author H M NUR FATTAH
 */
import java.util.ArrayList;
import java.util.List;

public class AuthManager {
    private List<User> registeredUsers;

    public AuthManager() {
        this.registeredUsers = new ArrayList<>();
    }

    public User register(String username, String password) {
        User newUser = new User(username, password);
        registeredUsers.add(newUser);
        System.out.println("Registrasi berhasil.");
        return newUser;
    }

    public User login(String username, String password) {
        for (User user : registeredUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login berhasil.");
                return user;
            }
        }
        System.out.println("Username atau password salah.");
        return null;
    }

    public void logout(User user) {
        System.out.println("Logout berhasil.");
    }

    public void inputBiodata(User user, Biodata biodata) {
        user.setBiodata(biodata);
        System.out.println("Biodata berhasil disimpan.");
    }

    public void ubahBiodata(User user, Biodata biodata) {
        user.getBiodata().ubahBiodata(
                biodata.getNamaLengkap(),
                biodata.getEmail(),
                biodata.getTanggalLahir(),
                biodata.getJenisKelamin(),
                biodata.getNomorTelepon()
        );
    }

    @Override
    public String toString() {
        return "AuthManager{" +
                "registeredUsers=" + registeredUsers +
                '}';
    }
}


