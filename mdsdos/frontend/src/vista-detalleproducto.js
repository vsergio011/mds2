import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaDetalleproducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 80%;">
  <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
   <vaadin-vertical-layout theme="spacing" style="width: 100%; flex-grow: 0; flex-shrink: 0; height: 15%;">
    <label style="font-weight: bold; align-self: stretch; ">Título del producto</label>
    <label style="align-self: stretch;" id="rateLabel"></label>
   </vaadin-vertical-layout>
   <vaadin-horizontal-layout theme="spacing" style="height: 85%; width: 95;">
    <vaadin-vertical-layout theme="spacing" id="lyimagenesLateral" style="width: 20%; height: 70%;"></vaadin-vertical-layout>
    <img style="border: solid; height: 70%; width: 80%; align-self: center;" id="img" img="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; flex-grow: 0; flex-shrink: 1;">
  <vaadin-vertical-layout theme="spacing" style="width: 90%; padding: var(--lumo-space-l); flex-shrink: 0; height: 15%; align-self: center;">
   <label style="font-weight: bold; align-self: stretch;">Descripción del producto</label>
   <label style="align-self: stretch; font-size: 13px; flex-grow: 0;" id="descriptionLabel"></label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 55%; align-self: center; padding: var(--lumo-space-m);">
   <label style="font-weight: bold; align-self: stretch;" id="label">Carácteristicas</label>
   <vaadin-text-area style="align-self: stretch; width: 100%; height: 100%;    background-color: hsl(0deg 0% 86% / 40%);" id="vaadinTextArea"></vaadin-text-area>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" style="width: 90%; padding: var(--lumo-space-l); height: 25%; border: solid; border-width: 1px; align-self: center; justify-content: space-between;">
   <vaadin-vertical-layout style="width: 100%; flex-grow: 1; flex-shrink: 1;">
    <vaadin-button style="width: 50%; align-self: flex-start;" id="updateBtn">
      Modificar 
    </vaadin-button>
    <vaadin-button style="width: 50%;" id="viewComentsBtn">
      Ver comentarios 
    </vaadin-button>
    <vaadin-button id="anadirACarritoBtn">
      Añadir a carrito 
    </vaadin-button>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="width: 100%;">
    <label style="width: 50%; align-self: flex-start;background-color:#dbdee2" id="priceLAbel"></label>
    <vaadin-button style="margin-top: var(--lumo-space-l); width: 50%; align-self: flex-start;" id="deleteBtn">
      Quitar ofertas 
    </vaadin-button>
    <vaadin-button style="width: 50%;" id="addOfferBtn">
      Añadir a Ofertas 
    </vaadin-button>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-detalleproducto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDetalleproducto.is, VistaDetalleproducto);
