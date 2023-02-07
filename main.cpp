#include <cmath>                                                      // abs(), pow()
#include <compare>                                                    // weak_ordering
#include <iomanip>                                                    // quoted()
#include <iostream>
#include <string>
#include <vector>
#include <type_traits>                                                // is_floating_point_v, common_type_t
#include <utility>                                                    // move()
#include "GroceryItem.hpp"
#include "GroceryItem.cpp"

int main()
{
    std::cout << std::fixed << std::setprecision(2) << "Welcome to Kroger.  Place grocery items into your shopping cart by entering each item's information." << std::endl;
    std::cout << "  enclose string entries in quotes, separate fields with comas" << std::endl;
    std::cout <<"Enter CTL-Z (Windows) or CTL-D (Linux) to quit" << std::endl;
    std::cout << std::endl;

    std::vector<GroceryItem *> items;
    bool quitLoop = true; //a counter boolean variable to countter the loop

    do 
    {
        std::cout << "Enter UPC, Product Brand, Product Name, and Price" << std::endl;
        std::cout << "(enclose string entries in quotes, separate fields with comas and entrie that have spaces with quotes)" << std::endl;
        static GroceryItem item;
        std::cout << "Item Added: ";
        if(!(std::cin >> item))
        {
            quitLoop = false;
        }

        items.push_back(new GroceryItem(std::move(item)));


    }
    while (quitLoop); //loop until it is true

    std::cout << std::endl;
    std::cout << std::endl;


    std::cout << "Here is an itemized list of the items in your shopping cart: " << std::endl;
    for(auto item = items.cbegin(); item < items.cend();++item)
    {
        std::cout << **item;
    }

    for(const auto item : items)
    {
        delete item;
    }



    return 0;
}


