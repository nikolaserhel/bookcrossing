//package by.serhel.springwebapp;
//
//import by.serhel.springwebapp.controllers.MainController;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.hamcrest.core.StringContains.containsString;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestBuilders.formLogin;
//import static org.springframework.security.test.web.servlet.response.SecurityMockMvcResultMatchers.authenticated;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@AutoConfigureMockMvc
//public class LoginTests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void contextLoads() throws Exception {
//        this.mockMvc.perform(get("/"))
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Welcome!")))
//                .andExpect(content().string(containsString("Here you can exchange books with other people.")));
//    }
//
//    @Test
//    public void accessDeniedTest() throws Exception {
//        this.mockMvc.perform(get("/books"))
//                .andDo(print())
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("http://localhost/login"));
//    }
//
//    @Test
////    @Sql(value = {"/create-user-before.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
//    public void authorizeTest() throws Exception {
//        this.mockMvc.perform(formLogin().user("admin").password("admin"))
//                .andExpect(status().is3xxRedirection())
//                .andExpect(redirectedUrl("/"));
//    }
////
////    @Test
////    public void badCredentials() throws Exception {
////        this.mockMvc.perform(post("/login").param("admin", "admin"))
////                .andDo(print())
////                .andExpect(status().isForbidden());
////    }
//}
