package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Component;


@Component
public class CommandLineRunnerBean implements CommandLineRunner {
    @Autowired
    PizzaRepository pizzaRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    public void run(String... args) {

        User user1 = new User();
        user1.setUsername("user");
        user1.setPassword("password");
        user1.setEmail("pizzaconfirmationjava@gmail.com");
        user1.setEnabled(true);
        userRepository.save(user1);

        Role role = new Role("user", "ROLE_USER");
        roleRepository.save(role);


        //TYPES
        Type dough = new Type("dough");
        typeRepository.save(dough);

        Type cheese = new Type("cheese");
        typeRepository.save(cheese);

        Type sauce = new Type("sauce");
        typeRepository.save(sauce);

        Type veggie = new Type("veggie");
        typeRepository.save(veggie);

        Type protein = new Type("protein");
        typeRepository.save(protein);

        Type topping = new Type("topping");
        typeRepository.save(topping);


        //DOUGH

        Ingredient ing1 = new Ingredient();
        ing1.setName("NY Style Crust");
        ing1.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159458/crust_mbjcir.jpg");
        ing1.setType(dough);
//        ing1.setTally(3);
        ingredientRepository.save(ing1);

        Ingredient ing2 = new Ingredient();
        ing2.setName("Neapolitan Crust");
        ing2.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159458/crust_mbjcir.jpg");
        ing2.setType(dough);
        ingredientRepository.save(ing2);

//        CHEESE
        Ingredient cheese1 = new Ingredient();
//        cheese1.setPicUrl();
        cheese1.setName("Mozzarella");
        cheese1.setType(cheese);
//        cheese1.setTally(5);
        ingredientRepository.save(cheese1);

        Ingredient cheese2 = new Ingredient();
//        cheese1.setPicUrl();
        cheese2.setName("Provolone");
        cheese2.setType(cheese);
        ingredientRepository.save(cheese2);

//        SAUCE

        Ingredient ing3 = new Ingredient();
        ing3.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599160918/tomatosauce_wrcg7l.jpg");
        ing3.setName("Classic Tomato");
        ing3.setType(sauce);
        ingredientRepository.save(ing3);

        Ingredient ing4 = new Ingredient();
        ing4.setName("White Sauce");
        ing4.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599160972/whitesauce_yxip12.jpg");
        ing4.setType(sauce);
        ingredientRepository.save(ing4);

//        PROTEIN

        Ingredient ing5 = new Ingredient();
        ing5.setName("Chicken Dices");
        ing5.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159453/chicken_noybkr.jpg");
        ing5.setType(protein);
        ingredientRepository.save(ing5);

        Ingredient ing6 = new Ingredient();
        ing6.setName("Pepperoni");
        ing6.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159440/pepperonipng_ih0qwx.png");
        ing6.setType(protein);
        ingredientRepository.save(ing6);

//        VEGETABLE

        Ingredient ing7 = new Ingredient();
        ing7.setName("Bell pepper");
        ing7.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159452/bellpeppers_qxz79w.jpg");
        ing7.setType(veggie);
        ingredientRepository.save(ing7);

        Ingredient ing8 = new Ingredient();
        ing8.setName("Mushroom");
        ing8.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159452/mashroom_nzb0zp.jpg");
        ing8.setType(veggie);
        ingredientRepository.save(ing8);

//        ADDITIONAL TOPPINGS

        Ingredient ing9 = new Ingredient();
        ing9.setName("Pineapple");
        ing9.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159446/pineapplepng_qni0jo.png");
        ing9.setType(topping);
        ingredientRepository.save(ing9);

        Ingredient ing10 = new Ingredient();
        ing10.setName("Black Olives");
        ing10.setPicUrl("https://res.cloudinary.com/dez6u9sef/image/upload/v1599159449/black_olives_n6docb.jpg");
        ing10.setType(topping);
//        ing10.setTally(7);
        ingredientRepository.save(ing10);

//        for (Ingredient ingredient : ingredientRepository.findAllByOrderByTallyDesc()){
//            System.out.println(ingredient.getName() + " " + ingredient.getTally());
//        }

    }

}
