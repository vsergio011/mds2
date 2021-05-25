import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaProducto extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; justify-content: center;">
 <vaadin-vertical-layout style="align-self: center; border-width: thin; border-style: solid; border-color: #000; width: 100%;">
  <label id="productLbl" style="align-self: center;"></label>
  <img src="" id="imgProducto" style="align-self: center;">
  <vaadin-horizontal-layout style="align-self: center; justify-content: space-between; width: 100%;">
   <vaadin-button id="moreInfoBtn" style="align-self: flex-start;">
     ... 
   </vaadin-button>
   <vaadin-button id="addOffertaBtn">
     Anadir oferta 
   </vaadin-button>
   <vaadin-button id="quitarOfertaBtn">
     Quitar Oferta 
   </vaadin-button>
   <vaadin-button id="addCarritoBtn">
     + 
   </vaadin-button>
   <label id="label" style="align-self: center;"></label>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
