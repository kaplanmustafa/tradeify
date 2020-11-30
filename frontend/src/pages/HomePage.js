import React from "react";
import ImageSlider from "../components/toolbox/ImageSlider";
import ProductCard from "../components/homePage/ProductCard";
import ProductHeaderCard from "../components/homePage/ProductHeaderCard";

const HomePage = () => {
  const images = [
    {
      id: "1",
      name: "first.jpg",
    },
    {
      id: "2",
      name: "second.jpg",
    },
    {
      id: "3",
      name: "third.jpg",
    },
  ];

  return (
    <div className="container">
      <div className="row">
        <ImageSlider images={images} />
      </div>

      <div className="row">
        <ProductHeaderCard category="popular products" />
      </div>
      <div className="row">
        <ProductCard category="discover" />
      </div>

      <div className="row">
        <ProductHeaderCard category="Laptop" />
      </div>
      <div className="row">
        <ProductCard generalId="3" subId="1" />
      </div>

      <div className="row">
        <ProductHeaderCard category="Mobile Phone" />
      </div>
      <div className="row">
        <ProductCard generalId="2" subId="1" />
      </div>

      <div className="row">
        <ProductHeaderCard category="Television" />
      </div>
      <div className="row">
        <ProductCard generalId="4" subId="1" />
      </div>

      <div className="row">
        <ProductHeaderCard category="Photo & Camera" />
      </div>
      <div className="row">
        <ProductCard generalId="6" subId="1" />
      </div>
    </div>
  );
};

export default HomePage;
