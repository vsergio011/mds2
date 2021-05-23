import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

class VistaProductopedido extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; border:solid;">
 <img id="imgProducto" style="height: 80%; align-self: center; flex-grow: 0; flex-shrink: 1; width: 20%;" src="https://www.ikea.com/mx/es/images/products/urskog-cojin-leon-gris__0552849_pe659099_s5.jpg?f=xs">
 <vaadin-vertical-layout theme="spacing" style="width: 30%; align-self: center;">
  <label id="nombreProductoLbl">Nombre del producto </label>
  <label id="descripProducLbl">Descripción breve del producto </label>
  <label id="dato1Lbl">- DAto 1 </label>
  <label id="dato2Lbl">- DAto 2 </label>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 25%;">
  <label id="precioUnidadLbl" style="width: 100%;">Precio por unidad: total</label>
  <label id="unidadesLbl">Unidades: 2 </label>
  <vaadin-button id="com,entarBtn">
    Comentar 
  </vaadin-button>
  <vaadin-button id="deleteBtn">
    Eliminar 
  </vaadin-button>
  <vaadin-combo-box id="cantidadCombo"></vaadin-combo-box>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 25%;">
  <label id="precioEurosLbl">Precio en euros </label>
  <label id="valoracionLbl">Valorado 5/5 </label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productopedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductopedido.is, VistaProductopedido);
